package com.deazzle.sampleapp.presentation.tindercards

import androidx.lifecycle.MutableLiveData
import com.apilib.response.model.cardlist.CardListItemResponse
import com.deazzle.sampleapp.core.plateform.ActionLiveData
import com.deazzle.sampleapp.core.plateform.BaseViewModel


class TinderCardViewModel(val cardViewModel: TinderCardModel) : BaseViewModel() {

   var fieldErrorLiveData = ActionLiveData<String>()

    fun fetchList() {
            cardViewModel.fetchTinderList()

    }

    fun showSuccess(): ActionLiveData<CardListItemResponse> {
        return cardViewModel.cardListResponse
    }

    fun showErrorMessage(): ActionLiveData<String> {
        return cardViewModel.errorMessageResponse
    }

    fun showHideProgress(): ActionLiveData<Boolean>{
        return cardViewModel.showOrHideProgress
    }


}