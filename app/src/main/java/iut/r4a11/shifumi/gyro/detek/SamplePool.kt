package iut.r4a11.shifumi.gyro.detek

class SamplePool {
    private var head: Sample? = null

    fun acquire(): Sample {
        var acquired = head
        if (acquired == null) {
            acquired = Sample()
        }
        else {
            head = acquired.next
        }
        return acquired
    }

    fun release(sample: Sample) {
        sample.next = head
        head = sample
    }
}