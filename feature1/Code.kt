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
        initImages()
    }

    private fun initFirebase() = Unit

    private fun initOkhht() = Unit
}