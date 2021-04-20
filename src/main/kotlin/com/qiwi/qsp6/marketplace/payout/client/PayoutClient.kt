package com.qiwi.qsp6.marketplace.payout.client

import com.qiwi.qsp6.marketplace.payout.model.PayoutRequest
import com.qiwi.qsp6.marketplace.payout.model.PayoutResponse

interface PayoutClient {

    fun sendClient(request: PayoutRequest) : PayoutResponse

}