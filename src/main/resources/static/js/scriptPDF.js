function generatePDF() {
    // Получаем ФИО из формы
    const fullName = document.getElementById('fullName').value;

    // Создаем новый документ PDF
    const doc = new jsPDF();

    // Добавляем текст в PDF
    doc.text(fullName, 10, 10);

    // Сохраняем PDF
    doc.save('my_pdf.pdf');
}