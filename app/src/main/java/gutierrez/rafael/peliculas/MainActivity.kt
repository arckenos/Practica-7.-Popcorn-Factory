package gutierrez.rafael.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

var peliculas : ArrayList<Pelicula> = ArrayList<Pelicula>()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter = AdaptadorMovies(this, peliculas)
        var listView : ListView = findViewById(R.id.listv)
        listView.adapter = adapter

    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.peli1), getString(R.string.peli1_desc), 175, R.drawable.bighero6)
        peliculas.add(pelicula1)
        val pelicula2 = Pelicula(2, getString(R.string.peli2), getString(R.string.peli2_desc), 176, R.drawable.mib)
        peliculas.add(pelicula2)
        val pelicula3 = Pelicula(3, getString(R.string.peli3), getString(R.string.peli3_desc), 120, R.drawable.toystory)
        peliculas.add(pelicula3)
        val pelicula4 = Pelicula(4, getString(R.string.peli4), getString(R.string.peli4_desc), 116, R.drawable.mil)
        peliculas.add(pelicula4)
        val pelicula5 = Pelicula(5, getString(R.string.peli5), getString(R.string.peli5_desc), 110, R.drawable.inception)
        peliculas.add(pelicula5)



    }
}