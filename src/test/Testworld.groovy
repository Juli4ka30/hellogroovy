package test
import julia.core.*
import org.junit.jupiter.api.*

class Testworld{


    @Test
    void testhello()
    {
    def stub = [call: {"Hello"}] as HelloWorldInterface
    HelloWorldClass wc = new HelloWorldClass(stub)
    assert wc.invokeCall() == "Hello"
}


}