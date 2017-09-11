package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Course;
import domain.Question;
import util.QuestionCreator;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    /*@RequestMapping("/s3Exam/{questionId}")*/
    @GetMapping("/s3Exam")
    public String s3Exam(Model model, @RequestParam(value="id", required=false, defaultValue="0") Integer id, @RequestParam(value="actionRequired", required=false, defaultValue="0") String actionRequired) {
        //model.addAttribute("name", name);
//        List<Answer> answers = new ArrayList<Answer>();
//        Answer answer1 = new Answer();
//        answer1.setId(1);
//        answer1.setAnswerText("Simple Storage Service");
//        Answer answer2 = new Answer();
//        answer2.setId(2);
//        answer2.setAnswerText("Strong Storage Solution");
//        Answer answer3 = new Answer();
//        answer3.setId(3);
//        answer3.setAnswerText("Simple Storage Solution");
//        Answer answer4 = new Answer();
//        answer4.setId(4);
//        answer4.setAnswerText("Strong Storage Service");
//        answers.add(answer1);
//        answers.add(answer2);
//        answers.add(answer3);
//        answers.add(answer4);
//        model.addAttribute("answers", answers);
        List<Question> questions = QuestionCreator.getQuestions();
        if(actionRequired.equals("nextQuestion")){
        	id = id +1;
        } else if(actionRequired.equals("previousQuestion")) {
        	id = id - 1;
        }
        Question question = questions.get(id);
        model.addAttribute("question", question);
        if(id == 0) {
        	model.addAttribute("isFirstQuestion", "true");
        } else {
        	model.addAttribute("isFirstQuestion", "false");
        }
        if(id == (questions.size() - 1))  {
        	model.addAttribute("isLastQuestion", "true");
        } else {
        	model.addAttribute("isLastQuestion", "false");
        }
        return "s3Exam";
    }
    
    @RequestMapping("/s3")
    
    public String s3(@RequestParam(value="name", required=false, defaultValue="World") String name, @RequestParam("id") Long id
    		, @RequestParam("actionRequired") String actionRequired, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("mode","development");
        List<Course> courses = new ArrayList<Course>();
        Course course1 = new Course();
        course1.setName("AWS S3");
        course1.setDescription("This is AWS S3 test. Lorem ipsum dolor sit amet, consectetur dipisicing elit. Sapiente esse necessitatibus neque.");
        course1.setLink("/s3Exam");
        courses.add(course1);
        Course course2 = new Course();
        course2.setName("AWS EC2");
        course2.setDescription("This is AWS EC2 test. Lorem ipsum dolor sit amet, consectetur dipisicing elit. Sapiente esse necessitatibus neque.");
        course2.setLink("http://www.aws.com/ec2");
        courses.add(course2);
        Course course3 = new Course();
        course3.setName("AWS Lambda");
        course3.setDescription("This is AWS Lambda test. Lorem ipsum dolor sit amet, consectetur dipisicing elit. Sapiente esse necessitatibus neque.");
        course3.setLink("http://www.aws.com/lambda");
        courses.add(course3);
        model.addAttribute("courses",courses);
        Course course4 = new Course();
        course4.setName("AWS Cloudfront");
        course4.setDescription("This is AWS Cloudfront test. Lorem ipsum dolor sit amet, consectetur dipisicing elit. Sapiente esse necessitatibus neque.");
        course4.setLink("http://www.aws.com/cloudFront");
        courses.add(course4);
        model.addAttribute("courses",courses);
        return "s3";
    }

}
