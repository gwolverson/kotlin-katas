package foobarqix

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FooBarQixTest {

    lateinit var fooBarQix: FooBarQix

    @BeforeAll
    fun setup() {
        fooBarQix = FooBarQix()
    }

    @Test
    fun whenComputeIsCalledWith1ItReturns1() {
        Assertions.assertEquals("1", fooBarQix.compute("1"))
    }

    @Test
    fun whenComputeIsCalledWith2ItReturns2() {
        Assertions.assertEquals("2", fooBarQix.compute("2"))
    }

    @Test
    fun whenComputeIsCalledWith3ItReturnsFooFoo() {
        Assertions.assertEquals("FooFoo", fooBarQix.compute("3"))
    }

    @Test
    fun whenComputeIsCalledWith5ItReturnsBarBar() {
        Assertions.assertEquals("BarBar", fooBarQix.compute("5"))
    }

    @Test
    fun whenComputeIsCalledWith7ItReturnsQixQix() {
        Assertions.assertEquals("QixQix", fooBarQix.compute("7"))
    }

    @Test
    fun whenComputeIsCalledWith9ItReturnsFoo() {
        Assertions.assertEquals("Foo", fooBarQix.compute("9"))
    }

    @Test
    fun whenComputeIsCalledWith10ItReturnsBar() {
        Assertions.assertEquals("Bar", fooBarQix.compute("10"))
    }

    @Test
    fun whenComputeIsCalledWith13ItReturnsFoo() {
        Assertions.assertEquals("Foo", fooBarQix.compute("13"))
    }

    @Test
    fun whenComputeIsCalledWith15ItReturnsFooBarBar() {
        Assertions.assertEquals("FooBarBar", fooBarQix.compute("15"))
    }

    @Test
    fun whenComputeIsCalledWith33ItReturnsFooFooFoo() {
        Assertions.assertEquals("FooFooFoo", fooBarQix.compute("33"))
    }

    @Test
    fun whenComputeIsCalledWith51ItReturnsFooBar() {
        Assertions.assertEquals("FooBar", fooBarQix.compute("51"))
    }

    @Test
    fun whenComputeIsCalledWith53ItReturnsBarFoo() {
        Assertions.assertEquals("BarFoo", fooBarQix.compute("53"))
    }
}