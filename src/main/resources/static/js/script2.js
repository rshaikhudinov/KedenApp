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
});

/* отработка событий у получателя */
document.getElementById('recipientFields').addEventListener('click', function (event) {
    const target = event.target;
    /* добавить посылку */
    if (target.classList.contains('addPackageButton')) {
        const recipientIndex = target.dataset.recipientIndex;
        addPackage(recipientIndex);
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
    if (target.classList.contains('deletePackageButton')) {
        const recipientIndex = target.dataset.recipientIndex;
        const packageIndex = target.dataset.packageIndex;
        deletePackage(recipientIndex, packageIndex);
    }
});

/* функция добавления посылки */
function addPackage(recipientIndex) {
    const packageFields = document.getElementById(`packageFields-${recipientIndex}`);
    const newPackageIndex = packageFields.querySelectorAll('.package').length;
    const newPackage = document.createElement('div');
    newPackage.innerHTML = createPackageTemplate(recipientIndex, newPackageIndex);
    packageFields.appendChild(newPackage);
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
function deletePackage(recipientIndex, packageIndex) {
    const packageElement = document.querySelector(
        `#packageFields-${recipientIndex} .package[data-package-index="${packageIndex}"]`
    );
    if (packageElement) {
        packageElement.remove();
        updatePackageIndices(recipientIndex);
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

        const packageFields = recipient.querySelector(`[id^="packageFields-"]`);
        if (packageFields) {
            packageFields.id = `packageFields-${newIndex}`;
            updatePackageIndices(newIndex);
        }

        const deleteButton = recipient.querySelector('.deleteRecipientButton');
        if (deleteButton) {
            deleteButton.dataset.recipientIndex = newIndex;
        }
    });

    recipientCount = recipients.length-1;
}

/* функция обновления индексов посылки */
function updatePackageIndices(recipientIndex) {
    const packages = document.querySelectorAll(`#packageFields-${recipientIndex} .package`);
    packages.forEach((pkg, newIndex) => {
        pkg.dataset.packageIndex = newIndex;

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
                    name.replace(/\.packages\[\d+\]/, `.packages[${newIndex}]`)
                );
            }
        });

        // Обновляем индекс кнопки удаления
        const deleteButton = pkg.querySelector('.deletePackageButton');
        if (deleteButton) {
            deleteButton.dataset.packageIndex = newIndex;
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
                    <label for="fio">ФИО:</label>
                    <input type="text" name="recipients[${index}].fio" required />
                </div>
                <div class="form-group">
                    <label for="iin">ИИН:</label>
                    <input type="text" name="recipients[${index}].iin" required pattern="\\d{12}" title="Введите 12-значный ИИН" />
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
                    <label for="photo">Фото документа:</label>
                    <input type="file" id="photo" name="recipients[${index}].photo" accept="image/*" required />
                </div>
                <div id="packageFields-${index}">
                    <h3>Посылка 1</h3>
                    <div class="package">
                        <div class="form-group">
                            <label for="commodityCode">Код ТНВЭД:</label>
                            <input type="text" name="recipients[${index}].packages[0].commodityCode" required />
                        </div>
                        <div class="form-group">
                            <label for="goodsDescriptionText">Описание:</label>
                            <input type="text" name="recipients[${index}].packages[0].goodsDescriptionText" required />
                        </div>
                        <div class="form-group">
                            <label for="unifiedGrossMassMeasure">Вес:</label>
                            <input type="text" name="recipients[${index}].packages[0].unifiedGrossMassMeasure" required />
                        </div>
                        <div class="form-group">
                            <label for="currencyInAmount">Сумма:</label>
                            <input type="text" name="recipients[${index}].packages[0].currencyInAmount" required />
                        </div>
                    </div>
                </div>
                <button type="button" class="addPackageButton" data-recipient-index="${index}">Добавить посылку</button>
            </div>
        </div>
    `;
}

/* функция генерации html посылки */
function createPackageTemplate(recipientIndex, packageIndex) {
    return `
        <div class="package" data-package-index="${packageIndex}">
            <h3>Посылка ${packageIndex + 1}</h3>
            <div class="form-group">
                <label for="commodityCode">Код ТНВЭД:</label>
                <input type="text" name="recipients[${recipientIndex}].packages[${packageIndex}].commodityCode" required />
            </div>
            <div class="form-group">
                <label for="goodsDescriptionText">Описание:</label>
                <input type="text" name="recipients[${recipientIndex}].packages[${packageIndex}].goodsDescriptionText" required />
            </div>
            <div class="form-group">
                <label for="unifiedGrossMassMeasure">Вес:</label>
                <input type="text" name="recipients[${recipientIndex}].packages[${packageIndex}].unifiedGrossMassMeasure" required />
            </div>
            <div class="form-group">
                <label for="currencyInAmount">Сумма:</label>
                <input type="text" name="recipients[${recipientIndex}].packages[${packageIndex}].currencyInAmount" required />
            </div>
            <button type="button" class="deletePackageButton" data-recipient-index="${recipientIndex}" data-package-index="${packageIndex}">Удалить посылку</button>
        </div>
    `;
}

