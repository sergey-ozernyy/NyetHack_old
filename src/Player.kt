
fun main(args: Array<String>) {

}
///Начало
<Spinner
    android:id="@+id/planets_spinner"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content" />


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="planets_array">
        <item>Mercury</item>
        <item>Venus</item>
        <item>Earth</item>
        <item>Mars</item>
        <item>Jupiter</item>
        <item>Saturn</item>
        <item>Uranus</item>
        <item>Neptune</item>
    </string-array>
</resources>


val spinner: Spinner = findViewById(R.id.spinner)//Объявляем переменную спиннер класса Спиннер, присваеваем ей ссылку на объект в хмл
// Create an ArrayAdapter using the string array and a default spinner layout
ArrayAdapter.createFromResource(//Создаем адаптер, который будет наполнять массив элементами спиннера из ресурсов
    this,
    R.array.planets_array,
    android.R.layout.simple_spinner_item
).also { adapter ->
    // Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    // Apply the adapter to the spinner
    spinner.adapter = adapter
}

class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}

val spinner: Spinner = findViewById(R.id.spinner)
spinner.onItemSelectedListener = this

        /*
        Нужно выучить:
        Классы
        Объекты
        Интерфейсы
        Лямбда-функции
        Понять, что такое spinner:Spinner = x;parent: AdapterView<*>, view: View, pos: Int, id: Long;also;this;
         */