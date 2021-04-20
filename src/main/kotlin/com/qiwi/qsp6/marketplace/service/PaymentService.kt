package com.qiwi.qsp6.marketplace.service

import com.qiwi.qsp6.marketplace.payment.model.PaymentStatus

interface PaymentService {
    fun updateStatus(status : PaymentStatus)
}