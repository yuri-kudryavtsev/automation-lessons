import org.junit.Test

/**
 * Created on 11.12.2018
 *
 * @author Yuri Kudryavtsev
 *         skype: yuri.kudryavtsev.indeed
 *         email: ykudryavtsev@maxilect.com
 */

class FirstTest {
    @Test
    void myFirstTest() {
        printHello("Yuri Kudryavtsev")
        printHello("Kamil Bikineev")
        printHello("test test")
        printHello("Test User")
        printHello("Daria Dmitrochenko")
        printHello("Ivan Medvedev")
        printHello("Vasya Pupkin")
        printHello("Пепяка!")
        printHello("KEk!")
        printHello("блаблабла")
        printHello("pork")
        printHello("больше строк")
        printHello("oK")
        printHello("ололо")
    }

    static printHello(String userName) {
        println("Hello, " + userName + "!")
    }
}
