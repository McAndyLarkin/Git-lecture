class Activity {
    fun onCreate() {
//        super().onCreate()
        initUI()
        initFirebase()
        initOkhht()
    }

    private fun initUI() {
        initText()
        initEditText()
        initSpinner()
        initButtons()
    }

    private fun initFirebase() = Unit

    private fun initOkhht() = Unit
}