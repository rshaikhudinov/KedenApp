/* счетчик получателей */
let recipientCount = 0;

/* добавить получателя */
document.getElementById('addRecipient').addEventListener('click', function () {
    const recipientFields = document.getElementById('recipientFields');
    recipientCount++;
    const recipientIndex = recipientCount;
    const newRecipient = document.createElement('div');
    newRecipient.innerHTML = createRecipientTemplate(recipientIndex);
    recipientFields.appendChild(newRecipient);
    initializePhotoInputs();
});

/* отработка событий у получателя */
document.getElementById('recipientFields').addEventListener('click', function (event) {
    const target = event.target;
    /* добавить посылку */
    if (target.classList.contains('addParcelButton')) {
        const recipientIndex = target.dataset.recipientIndex;
        addParcel(recipientIndex);
    }
    /* скрыть/раскрыть поля получателя */
    if (target.classList.contains('recipient-header')) {
        const recipientBody = target.nextElementSibling;
        recipientBody.classList.toggle('hidden');
    }
    /*удалить получателя */
    if (target.classList.contains('deleteRecipientButton')) {
        const recipientIndex = target.dataset.recipientIndex;
        deleteRecipient(recipientIndex);
    }
    /* удалить посылку */
    if (target.classList.contains('deleteParcelButton')) {
        const recipientIndex = target.dataset.recipientIndex;
        const parcelIndex = target.dataset.parcelIndex;
        deleteParcel(recipientIndex, parcelIndex);
    }
});

/* функция добавления посылки */
function addParcel(recipientIndex) {
    const parcelFields = document.getElementById(`parcelFields-${recipientIndex}`);
    const newParcelIndex = parcelFields.querySelectorAll('.parcel').length;
    const newParcel = document.createElement('div');
    newParcel.innerHTML = createParcelTemplate(recipientIndex, newParcelIndex);
    parcelFields.appendChild(newParcel);
}

/* функция удаления получателя */
function deleteRecipient(recipientIndex) {
    const recipient = document.querySelector(`.recipient-wrapper[data-recipient-index="${recipientIndex}"]`);
    if (recipient) {
        recipient.remove();
        updateRecipientIndices();
    }
}

/* функция удаления посылки */
function deleteParcel(recipientIndex, parcelIndex) {
    const parcelElement = document.querySelector(
        `#parcelFields-${recipientIndex} .parcel[data-parcel-index="${parcelIndex}"]`
    );
    if (parcelElement) {
        parcelElement.remove();
        updateParcelIndices(recipientIndex);
    }
}

/* функция обновления индекса получателя */
function updateRecipientIndices() {
    const recipients = document.querySelectorAll('.recipient-wrapper');
    recipients.forEach((recipient, newIndex) => {
        recipient.dataset.recipientIndex = newIndex;
        const header = recipient.querySelector('.recipient-header');
        header.textContent = `Получатель ${newIndex + 1}`;

        const inputs = recipient.querySelectorAll('input, select, textarea');
        inputs.forEach(input => {
            const name = input.getAttribute('name');
            if (name) {
                input.setAttribute('name', name.replace(/\[\d+\]/, `[${newIndex}]`));
            }
        });

        const parcelFields = recipient.querySelector(`[id^="parcelFields-"]`);
        if (parcelFields) {
            parcelFields.id = `parcelFields-${newIndex}`;
            updateParcelIndices(newIndex);
        }

        const deleteButton = recipient.querySelector('.deleteRecipientButton');
        if (deleteButton) {
            deleteButton.dataset.recipientIndex = newIndex;
        }
    });

    recipientCount = recipients.length-1;
}

/* функция обновления индексов посылки */
function updateParcelIndices(recipientIndex) {
    const parcels = document.querySelectorAll(`#parcelFields-${recipientIndex} .parcel`);
    parcels.forEach((pkg, newIndex) => {
        pkg.dataset.parcelIndex = newIndex;

        // Обновляем текст заголовка <h3>
        const header = pkg.querySelector('h3');
        if (header) {
            header.textContent = `Посылка ${newIndex + 1}`;
        }

        // Обновляем атрибуты name в полях формы
        const inputs = pkg.querySelectorAll('input, select, textarea');
        inputs.forEach(input => {
            const name = input.getAttribute('name');
            if (name) {
                input.setAttribute(
                    'name',
                    name.replace(/\.parcels\[\d+\]/, `.parcels[${newIndex}]`)
                );
            }
        });

        // Обновляем индекс кнопки удаления
        const deleteButton = pkg.querySelector('.deleteParcelButton');
        if (deleteButton) {
            deleteButton.dataset.parcelIndex = newIndex;
        }
    });
}

/* функция генерации html получателя */
function createRecipientTemplate(index) {
    return `
        <div class="recipient-wrapper" data-recipient-index="${index}">
            <h3 class="recipient-header">Получатель ${index + 1}</h3>
            <div class="recipient hidden" data-recipient-index="${index}">
                <button type="button" class="deleteRecipientButton" data-recipient-index="${index}">Удалить получателя</button>
                <div class="form-group">
                    <label for="iin">ИИН:</label>
                    <input type="text" name="recipients[${index}].iin" required pattern="\\d{12}" title="Введите 12-значный ИИН" />
                </div>
                <button type="button" class="findRecipientByIIN" data-recipient-index="${index}">Заполнить данные по ИИН</button>
                <div class="form-group">
                    <label for="fio">ФИО:</label>
                    <input type="text" name="recipients[${index}].fio" required />
                </div>
                <div class="form-group">
                    <label for="docId">Номер удостоверения:</label>
                    <input type="text" name="recipients[${index}].docId" required />
                </div>
                <div class="form-group">
                    <label for="docCreationDate">Дата выдачи документа:</label>
                    <input type="date" name="recipients[${index}].docCreationDate" required />
                </div>
                <div class="form-group">
                    <label for="regionName">Регион:</label>
                    <input type="text" name="recipients[${index}].regionName" required />
                </div>
                <div class="form-group">
                    <label for="cityName">Город:</label>
                    <input type="text" name="recipients[${index}].cityName" required />
                </div>
                <div class="form-group">
                    <label for="streetName">Улица:</label>
                    <input type="text" name="recipients[${index}].streetName" required />
                </div>
                <div class="form-group">
                    <label for="buildingNumberId">Дом:</label>
                    <input type="text" name="recipients[${index}].buildingNumberId" required />
                </div>
                <div class="form-group">
                    <label for="roomNumberId">Квартира:</label>
                    <input type="text" name="recipients[${index}].roomNumberId" />
                </div>
                <div class="form-group">
                    <label for="phone">Телефон:</label>
                    <input type="text" name="recipients[${index}].phone" placeholder="+7 777 7777777" required />
                </div>
                <div class="form-group">
                    <label for="photo-${index}">Фото документа:</label>
                    <input type="file" id="photo-${index}" data-recipient-index="${index}" accept="image/*" />
                    <img src="#" id="previewImage-${index}" alt="Preview" style="max-width: 200px; max-height: 200px; display: none;">
                    <input type="hidden" id="photoBase64-${index}" name="recipients[${index}].photoBase64"/>
                </div>
                <div id="parcelFields-${index}">
                    <h3>Посылка 1</h3>
                    <div class="parcel">
                        <div class="form-group">
                            <label for="commodityCode">Код ТНВЭД:</label>
                            <input type="text" name="recipients[${index}].parcels[0].commodityCode" required />
                        </div>
                        <div class="form-group">
                            <label for="goodsDescriptionText">Описание:</label>
                            <input type="text" name="recipients[${index}].parcels[0].goodsDescriptionText" required />
                        </div>
                        <div class="form-group">
                            <label for="unifiedGrossMassMeasure">Вес:</label>
                            <input type="text" name="recipients[${index}].parcels[0].unifiedGrossMassMeasure" required />
                        </div>
                        <div class="form-group">
                            <label for="currencyInAmount">Сумма:</label>
                            <input type="text" name="recipients[${index}].parcels[0].currencyInAmount" required />
                        </div>
                    </div>
                </div>
                <button type="button" class="addParcelButton" data-recipient-index="${index}">Добавить посылку</button>
            </div>
        </div>
    `;
}

/* функция генерации html посылки */
function createParcelTemplate(recipientIndex, parcelIndex) {
    return `
        <div class="parcel" data-parcel-index="${parcelIndex}">
            <h3>Посылка ${parcelIndex + 1}</h3>
            <div class="form-group">
                <label for="commodityCode">Код ТНВЭД:</label>
                <input type="text" name="recipients[${recipientIndex}].parcels[${parcelIndex}].commodityCode" required />
            </div>
            <div class="form-group">
                <label for="goodsDescriptionText">Описание:</label>
                <input type="text" name="recipients[${recipientIndex}].parcels[${parcelIndex}].goodsDescriptionText" required />
            </div>
            <div class="form-group">
                <label for="unifiedGrossMassMeasure">Вес:</label>
                <input type="text" name="recipients[${recipientIndex}].parcels[${parcelIndex}].unifiedGrossMassMeasure" required />
            </div>
            <div class="form-group">
                <label for="currencyInAmount">Сумма:</label>
                <input type="text" name="recipients[${recipientIndex}].parcels[${parcelIndex}].currencyInAmount" required />
            </div>
            <button type="button" class="deleteParcelButton" data-recipient-index="${recipientIndex}" data-parcel-index="${parcelIndex}">Удалить посылку</button>
        </div>
    `;
}

// для работы с картинкой документа получателя
function initializePhotoInputs() {
    const photoInputs = document.querySelectorAll('[id^="photo-"]'); // Выбираем ВСЕ элементы, id которых начинается с "photo-"

    photoInputs.forEach(photoInput => {
        const recipientIndex = photoInput.dataset.recipientIndex;
        const previewImage = document.getElementById(`previewImage-${recipientIndex}`);

        photoInput.addEventListener('change', function(event) {
            const file = event.target.files[0];

            if (file) {
                const reader = new FileReader();

                reader.onload = function(e) {
                    const base64Image = e.target.result;

                    previewImage.src = base64Image;
                    previewImage.style.display = 'block';

                    let hiddenInput = document.querySelector(`input[name="recipients[${recipientIndex}].photoBase64"]`);
                    if (!hiddenInput) {
                        hiddenInput = document.createElement('input');
                        hiddenInput.type = 'hidden';
                        hiddenInput.name = `recipients[${recipientIndex}].photoBase64`;
                        const recipientWrapper = photoInput.closest('.recipient-wrapper');
                        recipientWrapper.appendChild(hiddenInput);
                    }
                    hiddenInput.value = base64Image;
                };

                reader.readAsDataURL(file);
            } else {
                previewImage.src = "#";
                previewImage.style.display = 'none';
                let hiddenInput = document.querySelector(`input[name="recipients[${recipientIndex}].photoBase64"]`);
                if(hiddenInput){
                    hiddenInput.remove();
                }
            }
        });
    });
}

// Обработчик для "Заполнить данные по ИИН"
document.getElementById('recipientFields').addEventListener('click', function(event) {
    const target = event.target;
    if (target.classList.contains('findRecipientByIIN')) {
        const recipientIndex = target.dataset.recipientIndex;
        const iinInput = target.previousElementSibling.querySelector('input'); // Получаем input с ИИН
        const iin = iinInput.value;

        if (!iin || iin.length !== 12 || !/^\d+$/.test(iin)) {
            alert("Пожалуйста, введите корректный ИИН (12 цифр).");
            return; // Прерываем выполнение, если ИИН некорректный
        }

        $.ajax({
            url: "/recipient/" + iin,
            type: 'GET',
            dataType: 'json', // Ожидаем JSON ответ
            success: function(recipient) {
                if (!recipient) {
                    alert("Получатель с таким ИИН не найден.");
                    return;
                }

                // Заполняем поля формы полученными данными
                const recipientDiv = target.closest('.recipient');
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].fio"]`).value = recipient.fio || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].docId"]`).value = recipient.docId || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].docCreationDate"]`).value = recipient.docCreationDate || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].regionName"]`).value = recipient.regionName || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].cityName"]`).value = recipient.cityName || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].streetName"]`).value = recipient.streetName || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].buildingNumberId"]`).value = recipient.buildingNumberId || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].roomNumberId"]`).value = recipient.roomNumberId || '';
                recipientDiv.querySelector(`input[name="recipients[${recipientIndex}].phone"]`).value = recipient.phone || '';

                //заполняем фото
                const imgElement = recipientDiv.querySelector('img'); // Находим <img> внутри recipientDiv
                const base64Input = recipientDiv.querySelector('input[type="hidden"]'); // Находим скрытый input

                if (recipient.photoBase64) {
                    imgElement.src = recipient.photoBase64; // Устанавливаем src для <img>
                    imgElement.style.display = 'block'; // Показываем изображение
                    base64Input.value = recipient.photoBase64; // Устанавливаем значение для скрытого input
                } else {
                    imgElement.src = "#"; // Устанавливаем src на заглушку
                    imgElement.style.display = 'none'; // Скрываем изображение
                    base64Input.value = ""; // Очищаем скрытый input
                }
            },
            error: function(error) {
                console.error("Ошибка запроса:", error);
                alert("Ошибка получения данных по ИИН. Проверьте консоль.");
            }
        });
    }
});

$(document).ready(function() {
    initializePhotoInputs();
});