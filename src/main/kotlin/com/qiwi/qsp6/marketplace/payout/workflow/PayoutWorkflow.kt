package com.qiwi.qsp6.marketplace.payout.workflow

import com.qiwi.qsp6.marketplace.payment.model.Payment
import com.qiwi.qsp6.marketplace.payment.model.PaymentStatus
import com.qiwi.qsp6.marketplace.payout.client.PayoutClient
import com.qiwi.qsp6.marketplace.payout.model.PayoutRequest
import com.qiwi.qsp6.marketplace.payout.model.toPayoutRequest
import com.qiwi.qsp6.marketplace.service.PaymentService

class PayoutWorkflow(val paymentService: PaymentService, val payoutClient: PayoutClient) {
    fun sentToPaySystem(payment: Payment) {
        try {
            val payoutRequest = PayoutRequest(payment.id, payment.externalId)
            // .. todo a lot of business logic for validation
            paymentService.updateStatus(PaymentStatus.SENT_TO_PAYSYSTEM)
            // ..
            // ..
            val response = payoutClient.sendClient(payment.toPayoutRequest())
        } catch (e: Exception) {
            // TODO: Some business aware exception and logging
        }
    }
}



