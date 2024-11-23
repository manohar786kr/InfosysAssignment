package com.manohar.infosysassignment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manohar.infosysassignment.R
import com.manohar.infosysassignment.model.Customer
import com.manohar.infosysassignment.repo.Rental

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample customer and car setup
        val customer1 = Customer(name = "Android User", id = 1, speedLimit = 80)

        // Create a rental class object
        val rental1 = Rental(customer = customer1)

        // driving at different speeds
        // this method will get call from API which will return the vehicle speed
        rental1.driveAtSpeed(70) // Should not exceed speed limit
        rental1.driveAtSpeed(100) // Should exceed speed limit
    }
}
