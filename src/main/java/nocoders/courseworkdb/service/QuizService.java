package nocoders.courseworkdb.service;
import java.util.Collections;
import java.util.List;

import nocoders.courseworkdb.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import nocoders.courseworkdb.model.Question;
import nocoders.courseworkdb.model.QuestionForm;
import nocoders.courseworkdb.model.Result;
import nocoders.courseworkdb.repository.QuestionRepo;
import nocoders.courseworkdb.repository.ResultRepo;

@Service
public class QuizService {

    @Autowired
    QuestionForm qForm;

    @Autowired
    QuestionRepo qRepo;

    @Autowired
    ResultRepo rRepo;

    QuestionRepository questionRepository;

    /**
     * Get a list of 15 random questions.
     *
     * @return a QuestionForm with 15 random questions
     */

    public QuestionForm getQuestions() {
        List<Question> allQuestions = qRepo.findAll();
        Collections.shuffle(allQuestions);
        List<Question> questionList = allQuestions.subList(0, 2);
        qForm.setQuestions(questionList);
        return qForm;
    }

    public QuestionForm getQuestionsByQuizId(Long quizId) {
        List<Question> allQuestions = questionRepository.findByQuizId(quizId);
        Collections.shuffle(allQuestions);
        List<Question> questionList = allQuestions.subList(0, 5);
        qForm.setQuestions(questionList);
        return qForm;
    }




//    public QuestionForm getQuestions() {
//        List<Question> allQuestions = qRepo.findAll();
//        List<Question> questionList = new ArrayList<Question>();
//        Random random = new Random();
//
//        for (int i = 0; i < 15 && i < allQuestions.size(); i++) {
//            int rand = random.nextInt(allQuestions.size());
//            questionList.add(allQuestions.get(rand));
//            allQuestions.remove(rand);
//        }
//
//        qForm.setQuestions(questionList);
//        return qForm;
//    }

    /**
     * Get the number of correct answers from a QuestionForm.
     *
     * @param qForm QuestionForm to evaluate
     * @return number of correct answers
     */
    public int getResult(QuestionForm qForm) {
        int correct = 0;

        for (Question q : qForm.getQuestions()) {
            if (q.getAns() == q.getChose()) {
                correct++;
            }
        }

        return correct;
    }

    /**
     * Save a user's quiz result.
     *
     * @param result user's quiz result
     */
    public void saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setUsername(result.getUsername());
        saveResult.setTotalCorrect(result.getTotalCorrect());
        rRepo.save(saveResult);
    }

    /**
     * Get the top quiz scores in descending order.
     *
     * @return a List of Result objects sorted by totalCorrect
     */
    public List<Result> getTopScore() {
        List<Result> scoreList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
        return scoreList;
    }

    /**
     * Get a list of all questions in the database.
     *
     * @return a List of all Question objects
     */
    public List<Question> listAll() {
        return qRepo.findAll();
    }

    /**
     * Save a Question object to the database.
     *
     * @param question Question object to save
     */
    public void save(Question question) {
        qRepo.save(question);
    }

    /**
     * Get a specific Question object by ID.
     *
     * @param quesId ID of the Question object to retrieve
     * @return the Question object with the specified ID
     */
    public Question get(Long quesId) {
        return qRepo.findById(quesId).get();
    }

    /**
     * Delete a Question object by ID.
     *
     * @param quesId ID of the Question object to delete
     */
    public void delete(Long quesId) {
        qRepo.deleteById(quesId);
    }


}














//
//@Service
//public class QuizService {
//
////    @Autowired
////    Question question;
//    @Autowired
//    QuestionForm qForm;
//    @Autowired
//    QuestionRepo qRepo;
//    @Autowired
//    Result result;
//    @Autowired
//    ResultRepo rRepo;
//
//
////    public QuestionForm getQuestionsBySubjectId(int subject_id) {
////        List<Question> allQues = qRepo.findBySubjectId(subject_id);
////        List<Question> qList = new ArrayList<Question>();
////
////        Random random = new Random();
////
////        for(int i=0; i<5 && i<allQues.size(); i++) {
////            int rand = random.nextInt(allQues.size());
////            qList.add(allQues.get(rand));
////            allQues.remove(rand);
////        }
////
////        qForm.setQuestions(qList);
////
////        return qForm;
////    }
//
//
//    public QuestionForm getQuestions() {
//        List<Question> allQues = qRepo.findAll();
//        List<Question> qList = new ArrayList<Question>();
//
//        Random random = new Random();
//
//        for(int i=0; i<15; i++) {
//            int rand = random.nextInt(allQues.size());
//            qList.add(allQues.get(rand));
//            allQues.remove(rand);
//        }
//
//        qForm.setQuestions(qList);
//
//        return qForm;
//    }
//
//    public int getResult(QuestionForm qForm) {
//        int correct = 0;
//
//        for(Question q: qForm.getQuestions())
//            if(q.getAns() == q.getChose())
//                correct++;
//
//        return correct;
//    }
//
//
//
//
//    public void saveScore(Result result) {
//        Result saveResult = new Result();
//        saveResult.setUsername(result.getUsername());
//        saveResult.setTotalCorrect(result.getTotalCorrect());
//        rRepo.save(saveResult);
//    }
//
//    public List<Result> getTopScore() {
//        List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
//
//        return sList;
//    }
//
//
//
//
//    public List<Question> listAll() {
//        return qRepo.findAll();
//    }
//    public void save(Question question) {
//        qRepo.save(question);
//    }
//
//    public Question get(int quesId) {
//        return qRepo.findById(quesId).get();
//    }
//
//    public void delete(int quesId) {
//        qRepo.deleteById(quesId);
//    }
//}










