package com.qiwi.qsp6.marketplace.payout.model

import com.qiwi.qsp6.marketplace.payment.model.Payment

data class PayoutRequest(val id: Long, val payoutId: String)

fun Payment.toPayoutRequest() : PayoutRequest {
    return PayoutRequest(this.id, this.externalId)
}
