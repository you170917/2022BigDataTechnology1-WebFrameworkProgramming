import org.springframework.beans.factory.annotation.Autowired;



public class SecurityConfig<MimeMessage> {
    try {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setSubject("账户登录提醒");
        helper.setFrom("2812527373@qq.com");
        Date date = new Date();
        helper.setSentDate(date);
        helper.setText("<p>您的账号已于 " + date.toString() + " 进行登录!</p><img
                src='cid:p1'/>", true);
                helper.addInline("p1",new
                        FileSystemResource("C:\\Users\\linwei\\Desktop\\1.jpg"));
        javaMailSender.send(mimeMessage);
    } catch (MessagingException e) {
        log.error("发送邮件失败: " + e.toString());
    }
    JavaMailSender javaMailSender;
}