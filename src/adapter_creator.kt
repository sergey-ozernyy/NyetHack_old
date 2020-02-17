var adapter = ArrayAdapter<String>(
  this,
  android.R.layout.simple_list_item1,
  arrayOf<String>("Рыжик", "Барсик", "Мурзик"))
-----
val catNames = arrayOf<String>("Рыжик", "Барсик", "Мурзик")
val adapter = ArrayAdapter<String>(this, 
                                   R.layout.list_item, 
                                   catNames)
listView.setAdapter(adapter)  
--------------
val spinner = findViewById(R.id.spinner1) as Spinner
val adapter = ArrayAdapter.createFromResource(
  this, R.array.dayofweek, android.R.layout.simple_spinner_item)
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
spinner.setAdapter(adapter)
  
---------------  
val spinner = findViewById(R.id.spinner) as Spinner
val selected = spinner.getSelectedItem().toString()
Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT).show()  
