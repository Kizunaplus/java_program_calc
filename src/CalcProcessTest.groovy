import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.testng.annotations.BeforeSuite

/**
 * CalcProcessテストクラス.
 */
@RunWith(JUnit4.class)
class CalcProcessTest extends GroovyTestCase {

    /**
     * テスト対象
     */
    def target

    /**
     * テスト実行前初期化
     */
    @Before
    void setup() {
        target = new CalcProcess()
    }

    /**
     * execメソッドテストケース.
     */
    @Test
    void testExec() {
        assert "0" == target.exec("1 - 1")
        assert "0" == target.exec("0 + 0")
        assert "0" == target.exec("-1 + 1")
        assert "0" == target.exec("-1 + 1")
        assert "2" == target.exec("1 + 1")
        assert "6" == target.exec("1 + 2 + 3")
        assert "6" == target.exec("1+2+3")
        assert "6" == target.exec("3+2 + 1")
        assert "-3" == target.exec("5 - 2 - 6")
        assert "10" == target.exec("1+1+1+1+1+1+1+1+1+1")
        assert "" == target.exec("1+1+")
        assert "" == target.exec("")
        assert "" == target.exec(null)
    }
}
