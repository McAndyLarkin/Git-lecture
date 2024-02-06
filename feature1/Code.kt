class Activity {
    fun onCreate() {
//        super().onCreate()
        initUI()
        initFirebase()
        initOkhht()
    }

    private fun initUI() {
        initText()
        initButtons()
    }

    private fun initFirebase() = Unit

    private fun initOkhht() = Unit
}