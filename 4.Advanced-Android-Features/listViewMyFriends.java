public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView friendsListView = (ListView) findViewById(R.id.friendsListView);

        final ArrayList<String> myFriends = new ArrayList<String>(asList("Taleb", "Anas", "Bipu", "Ashiq"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        friendsListView.setAdapter(arrayAdapter);

        friendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(getApplicationContext(), "Hello " + myFriends.get(i), Toast.LENGTH_LONG).show();
            }
        })
    }
}