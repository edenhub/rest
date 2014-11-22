package TestAnnontation.demo01;

import pri.annontation.demo01.NewAnno;
import pri.annontation.demo02.ColorType;

/**
 * Created by adam on 14-11-22.
 */

@NewAnno
@ColorType(name="adam",content="chen")
public class TestNewAnno {

    @ColorType(name="adam",content="chen")
    public TestNewAnno(){}
}
