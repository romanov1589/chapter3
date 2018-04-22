package conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MagicBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MagicBeanConfig.class);
        MagicBean magicBean = (MagicBean)ctx.getBean("magic");
        magicBean.doMagic();
    }
}
