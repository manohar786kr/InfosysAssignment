package com.manohar.infosysassignment.repo

import com.manohar.infosysassignment.model.Customer

class Rental(private val customer: Customer) {

    private var currentSpeed = 0

    // Method for checking speed limit
    fun driveAtSpeed(speed: Int) {
        currentSpeed = speed
        println("Car is currently driving at $currentSpeed km/h.")

        // Check speed limit
        if (currentSpeed > customer.speedLimit) {
            notifyRentalCompany()
            sendSpeedWarningToCustomer()
        }
    }

    // Notify the rental company if the speed limit is exceeded
    private fun notifyRentalCompany() {
        println("Rental Company Notification: Customer ${customer.name} exceeded the speed limit of ${customer.speedLimit} km/h!")
    }

    // Send a warning to the customer if the speed limit is exceeded
    private fun sendSpeedWarningToCustomer() {
        println("Warning: Dear ${customer.name}, you have exceeded the speed limit of ${customer.speedLimit} km/h. Please slow down!")
    }
}