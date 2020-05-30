package `in`.ac.citydetails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Array list of cities
        val city= arrayOf<String>("Ahmedabad","Baroda","Surat")

        var ada=ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,city)
        spinner.adapter=ada

        btnSearch.setOnClickListener {
            //conditional statements
            if(spinner.selectedItem.toString().equals("Ahmedabad"))
            {
                ahmedabad()
            }
            else if (spinner.selectedItem.toString().equals("Baroda"))
            {
               Log.d("msg","msg")
                baroda()
            }
            else if (spinner.selectedItem.toString().equals("Surat"))
            {
                surat()
            }
            else
            {
                Toast.makeText(this,"Something went wrong",Toast.LENGTH_LONG).show()
            }
        }

    }

    //user define function
    fun ahmedabad()
    {
        var intent:Intent= Intent(this,AhmedabadInfo::class.java)
        startActivity(intent)
    }
    fun baroda()
    {
        var intent:Intent= Intent(this,BarodaInfo::class.java)
        startActivity(intent)
    }
    fun surat()
    {
        var intent:Intent= Intent(this,SuratInfo::class.java)
        startActivity(intent)
    }
}
