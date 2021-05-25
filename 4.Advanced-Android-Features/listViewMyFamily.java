public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Maruf");
        myFamily.add("Mahin");
        myFamily.add("Maria");

        // Array adapter er kaj hosse Arraylist theke list gula niye segulo ListView te add kora

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Log.i(tag: "Person selected: ", myFamily.get(i));
            }
        });
    }
}