package com.example.davaleba5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView
            by lazy { findViewById(R.id.recyclerview) }
    private val productsAdapter by lazy { ProductsAdapter(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db=ProductDBHelper(this)
        db.insert("პური",0.80f)
        db.insert("კარაქი",2.10f)
        db.insert("კვერცხი",0.30f)
        db.insert("შაქარი",1.40f)
        db.insert("მარილი",1.00f)
        db.insert("რძე",2.00f)
        db.insert("ხორცი",10.00f)
        db.insert("ზეთი",2.00f)
        db.insert("ბრინჯი",1.00f)
        db.insert("Fanta",1.40f)
        db.insert("კოკა კოლა",1.80f)
        db.insert("ლიმონათი",1.50f)
        db.insert("წყალი",2.00f)
        db.insert("ვაშლი",3.00f)
        db.insert("მსხალი",3.00f)
        db.insert("ატამი",3.00f)
        db.insert("ფორთოხალი",2.00f)
        db.insert("კივი",3.00f)
        db.insert("ყურძენი",3.00f)
        db.insert("ანანასი",4.00f)
        db.insert("ალუბალი",3.00f)
        db.insert("საზამთრო",0.40f)
        db.insert("ნესვი",0.90f)
        db.insert("კარტოფილი",1.00f)
        db.insert("კიტრი",0.90f)
        db.insert("პამიდორი",2.00f)
        db.insert("სტაფილო",1.40f)
        db.select(0)
        recyclerView.adapter = productsAdapter
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        productsAdapter.setData(listOf(Product()),listOf(db))
    }
}