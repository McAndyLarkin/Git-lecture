class Activity {
    fun onCreate() {
//        super().onCreate()
        initUI()
        initFirebase()
        initOkhht()
        initDI()
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