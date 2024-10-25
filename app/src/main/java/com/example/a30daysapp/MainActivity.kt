package com.example.catbreedapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysapp.CatBreed
import com.example.a30daysapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CatBreedAdapter


    private val catBreeds = listOf(
        CatBreed(1, "Abyssinian", R.drawable.abyssinian, "Known for their distinctive ticked tabby coat and playful personality.", tips = "Regular Vet Checkups: Schedule annual check-ups to monitor overall health."),
        CatBreed(2, "Bengal", R.drawable.bengal, "A striking breed with a wild-looking coat and a playful, energetic nature.", tips = "Vaccinations: Keep up-to-date on core vaccinations to prevent diseases."),
        CatBreed(3, "Birman", R.drawable.birman, "A gentle giant with long, silky hair and striking blue eyes.", tips = "Spay or Neuter: Prevent unwanted litters and behavioral issues."),
        CatBreed(4, "Bombay", R.drawable.bombay, "A sleek, black cat with a shiny coat and a sweet, affectionate personality.", tips = "Quality Diet: Choose a balanced diet suitable for your cat's age and activity level."),
        CatBreed(5, "British Shorthair", R.drawable.british_shorthair, "A sturdy, round-faced cat with a calm and docile temperament.", tips = "Fresh Water: Provide clean, fresh water daily."),
        CatBreed(6, "Burmese", R.drawable.burmese, "A social, intelligent cat with a short, glossy coat and expressive eyes.", tips = "gsdhgsadghjs"),
        CatBreed(7, "Chartreux", R.drawable.chartreux, "A natural mouser with a dense, blue-gray coat and a quiet, gentle nature.   ", tips = "gsdhgsadghjs"),
        CatBreed(8, "Cornish Rex", R.drawable.cornish_rex, "A rare breed with a curly, hairless coat and a playful, mischievous personality.", tips = "gsdhgsadghjs"),
        CatBreed(9, "Devon Rex", R.drawable.devon_rex, "Another curly-haired breed with large ears and a friendly, affectionate nature.", tips = "gsdhgsadghjs"),
        CatBreed(10, "Egyptian Mau", R.drawable.egyptian_mau, "The oldest domesticated cat breed, known for its distinctive spotted coat and athletic build.", tips = "gsdhgsadghjs"),
        CatBreed(11, "Himalayan", R.drawable.himalayan, "A colorpoint cat with a long, silky coat and a sweet, gentle personality.", tips = "gsdhgsadghjs"),
        CatBreed(12, "Japanese Bobtail", R.drawable.japanese_bobtail, "A unique breed with a short, bobbed tail and a playful, dog-like personality.", tips = "gsdhgsadghjs"),
        CatBreed(13, "Maine Coon", R.drawable.maine_coon, "The largest domesticated cat breed, known for its long, flowing coat and friendly, outgoing nature.", tips = "gsdhgsadghjs"),
        CatBreed(14, "Manx", R.drawable.manx, "A tailless or stub-tailed cat with a playful, energetic personality.", tips = "gsdhgsadghjs"),
        CatBreed(15, "Persian", R.drawable.persian, "A long-haired cat with a sweet, gentle personality and a luxurious coat.", tips = "gsdhgsadghjs"),
        CatBreed(16, "Ragdoll", R.drawable.ragdoll, "A large, docile cat known for its floppy limbs and affectionate nature.", tips = "gsdhgsadghjs"),
        CatBreed(17, "Russian Blue", R.drawable.russian_blue, "A sleek, blue-gray cat with a quiet, gentle personality..", tips = "gsdhgsadghjs"),
        CatBreed(18, "Scottish Fold", R.drawable.scottish_fold, "A distinctive breed with folded ears and a sweet, affectionate personality.", tips = "gsdhgsadghjs"),
        CatBreed(19, "Siamese", R.drawable.siamese, "A vocal, intelligent cat with striking blue eyes and a pointed coat.", tips = "gsdhgsadghjs"),
        CatBreed(20, "Siberian", R.drawable.siberian, "A hardy, playful cat with a thick, waterproof coat and a gentle, affectionate nature.", tips = "gsdhgsadghjs"),
        CatBreed(21, "Sphynx", R.drawable.sphynx, "A hairless cat with a warm, wrinkled skin and a playful, affectionate personality.", tips = "gsdhgsadghjs"),
        CatBreed(22, "Tonkinese", R.drawable.tonkinese, "A social, intelligent cat with a silky coat and a playful, mischievous nature.", tips = "gsdhgsadghjs"),
        CatBreed(23, "Turkish Angora", R.drawable.turkish_angora, "A long-haired cat with a silky coat and a playful, energetic personality.", tips = "gsdhgsadghjs"),
        CatBreed(24, "Turkish Van", R.drawable.turkish_van, "A semi-aquatic cat with a distinctive white coat and a playful, energetic nature.", tips = "gsdhgsadghjs"),
        CatBreed(25, "American Shorthair", R.drawable.american_shorthair, "A classic American cat breed, known for its sturdy build and calm, friendly demeanor.", tips = "gsdhgsadghjs"),
        CatBreed(26, "American Curl", R.drawable.american_curl, "A unique breed with distinctive curled-back ears and a sweet, affectionate personality.", tips = "gsdhgsadghjs"),
        CatBreed(27, "Exotic Shorthair", R.drawable.exotic_shorthair, "A plush, round-faced cat with a calm and gentle nature, similar to a Persian but with a shorter coat.", tips = "gsdhgsadghjs"),
        CatBreed(28, "Ocicat", R.drawable.ocicat, "A medium-sized cat with a striking spotted coat and a playful, energetic personality.", tips = "gsdhgsadghjs"),
        CatBreed(29, "Savannah", R.drawable.savannah, "A large, exotic-looking cat with a wild appearance and a playful, dog-like personality.", tips = "gsdhgsadghjs"),
        CatBreed(30, "Javanese", R.drawable.javanese, "A long-haired version of the Tonkinese, with a silky coat and a playful, affectionate nature.", tips = "gsdhgsadghjs")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = CatBreedAdapter(catBreeds)
        recyclerView.adapter = adapter
    }
}
