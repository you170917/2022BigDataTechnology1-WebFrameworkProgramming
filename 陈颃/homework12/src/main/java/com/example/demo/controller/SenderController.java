@RestController
public class SenderController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        String context = "hello " + new Date();
        System.out.println("Sender 生产者发送消息 : " + context);
        rabbitTemplate.convertAndSend("exchange", "TestDirectRouting",context);
        return "消息发送成功!";
    }
}