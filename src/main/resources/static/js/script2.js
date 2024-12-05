let recipientCount = 0;

document.getElementById('addRecipient').addEventListener('click', function () {
    const recipientFields = document.getElementById('recipients');

    // Увеличиваем счетчик получателей
    recipientCount++;

    const recipientTemplate = `
        <h3>Получатель ${recipientCount+1}</h3>
        <div class="recipient" data-recipient-index="${recipientCount}">
            <div class="form-group">
                <label for="fio">ФИО:</label>
                <input type="text" name="recipients[${recipientCount}].fio" required />
            </div>
            <div class="form-group">
                <label for="iin">ИИН:</label>
                <input type="text" name="recipients[${recipientCount}].iin" required pattern="\\d{12}" title="Введите 12-значный ИИН" />
            </div>
            <div class="form-group">
                <label for="docId">Номер удостоверения:</label>
                <input type="text" name="recipients[${recipientCount}].docId" required />
            </div>
            <div class="form-group">
                <label for="docCreationDate">Дата выдачи документа:</label>
                <input type="date" name="recipients[${recipientCount}].docCreationDate" required />
            </div>
            <div class="form-group">
                <label for="regionName">Регион:</label>
                <input type="text" name="recipients[${recipientCount}].regionName" required />
            </div>
            <div class="form-group">
                <label for="cityName">Город:</label>
                <input type="text" name="recipients[${recipientCount}].cityName" required />
            </div>
            <div class="form-group">
                <label for="streetName">Улица:</label>
                <input type="text" name="recipients[${recipientCount}].streetName" required />
            </div>
            <div class="form-group">
                <label for="buildingNumberId">Дом:</label>
                <input type="text" name="recipients[${recipientCount}].buildingNumberId" required />
            </div>
            <div class="form-group">
                <label for="roomNumberId">Квартира:</label>
                <input type="text" name="recipients[${recipientCount}].roomNumberId" />
            </div>
            <div class="form-group">
                <label for="phone">Телефон:</label>
                <input type="text" name="recipients[${recipientCount}].phone" placeholder="+7 777 7777777" required />
            </div>
            <div id="packageFields-${recipientCount}">
                <h3>Посылка 1</h3>
                <div class="package">
                    <div class="form-group">
                        <label for="commodityCode">Код ТНВЭД:</label>
                        <input type="text" name="recipients[${recipientCount}].packages[0].commodityCode" required />
                    </div>
                    <div class="form-group">
                        <label for="goodsDescriptionText">Описание:</label>
                        <input type="text" name="recipients[${recipientCount}].packages[0].goodsDescriptionText" required />
                    </div>
                    <div class="form-group">
                        <label for="unifiedGrossMassMeasure">Вес:</label>
                        <input type="text" name="recipients[${recipientCount}].packages[0].unifiedGrossMassMeasure" required />
                    </div>
                    <div class="form-group">
                        <label for="currencyInAmount">Сумма:</label>
                        <input type="text" name="recipients[${recipientCount}].packages[0].currencyInAmount" required />
                    </div>
                </div>
            </div>
            <button type="button" class="addPackageButton" data-recipient-index="${recipientCount}">Добавить посылку</button>
        </div>
    `;

    const newRecipientDiv = document.createElement('div');
    newRecipientDiv.innerHTML = recipientTemplate;
    recipientFields.appendChild(newRecipientDiv);
});

document.getElementById('recipients').addEventListener('click', function (event) {
    if (event.target.classList.contains('addPackageButton')) {
        const recipientIndex = event.target.dataset.recipientIndex;
        const packageFields = document.getElementById(`packageFields-${recipientIndex}`);
        const newPackageIndex = packageFields.querySelectorAll('.package').length;

        const packageTemplate = `
            <h3>Посылка ${newPackageIndex+1}</h3>
            <div class="package">
                <div class="form-group">
                    <label for="commodityCode">Код ТНВЭД:</label>
                    <input type="text" name="recipients[${recipientIndex}].packages[${newPackageIndex}].commodityCode" required />
                </div>
                <div class="form-group">
                    <label for="goodsDescriptionText">Описание:</label>
                    <input type="text" name="recipients[${recipientIndex}].packages[${newPackageIndex}].goodsDescriptionText" required />
                </div>
                <div class="form-group">
                    <label for="unifiedGrossMassMeasure">Вес:</label>
                    <input type="text" name="recipients[${recipientIndex}].packages[${newPackageIndex}].unifiedGrossMassMeasure" required />
                </div>
                <div class="form-group">
                    <label for="currencyInAmount">Сумма:</label>
                    <input type="text" name="recipients[${recipientIndex}].packages[${newPackageIndex}].currencyInAmount" required />
                </div>
            </div>
        `;

        const newPackageDiv = document.createElement('div');
        newPackageDiv.innerHTML = packageTemplate;
        packageFields.appendChild(newPackageDiv);
    }
});
