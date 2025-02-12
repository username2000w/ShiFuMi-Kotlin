package iut.r4a11.shifumi.gyro.detek

class Sample {
    var timestamp: Long = 0
    var accelerating: Boolean = false
    var next: Sample? = null
}