document.getElementById('addRecipient').addEventListener('click', function() {
    const recipientFields = document.getElementById('recipientFields');
    const newRecipientIndex = recipientFields.children.length;

    const recipientTemplate = `
        <div class="recipient">
            <div class="form-group">
                <label for="fio">ФИО:</label>
                <input type="text" name="recipients[${newRecipientIndex}].fio" required />
            </div>
            <div class="form-group">
                <label for="iin">ИИН:</label>
                <input type="text" name="recipients[${newRecipientIndex}].iin" required pattern="\\d{12}" title="Введите 12-значный ИИН" />
            </div>
            <div class="form-group">
                <label for="docId">Номер удостоверения:</label>
                <input type="text" name="recipients[${newRecipientIndex}].docId" required />
            </div>
            <div class="form-group">
                <label for="docCreationDate">Дата выдачи документа:</label>
                <input type="date" name="recipients[${newRecipientIndex}].docCreationDate" required />
            </div>
            <div class="form-group">
                <label for="regionName">Регион:</label>
                <input type="text" name="recipients[${newRecipientIndex}].regionName" required />
            </div>
            <div class="form-group">
                <label for="cityName">Город:</label>
                <input type="text" name="recipients[${newRecipientIndex}].cityName" required />
            </div>
            <div class="form-group">
                <label for="streetName">Улица:</label>
                <input type="text" name="recipients[${newRecipientIndex}].streetName" required />
            </div>
            <div class="form-group">
                <label for="buildingNumberId">Дом:</label>
                <input type="text" name="recipients[${newRecipientIndex}].buildingNumberId" required />
            </div>
            <div class="form-group">
                <label for="roomNumberId">Квартира:</label>
                <input type="text" name="recipients[${newRecipientIndex}].roomNumberId" />
            </div>
            <div class="form-group">
                <label for="phone">Телефон:</label>
                <input type="text" name="recipients[${newRecipientIndex}].phone" placeholder="+7 777 77777" required />
            </div>
        </div>
    `;

    const newRecipientDiv = document.createElement('div');
    newRecipientDiv.innerHTML = recipientTemplate;
    recipientFields.appendChild(newRecipientDiv);
});
