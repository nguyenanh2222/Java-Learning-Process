package t3h.vn.backend_2208.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import t3h.vn.backend_2208.db.DbUtils;
import t3h.vn.backend_2208.dto.Book;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {

    // 1: làm lại theo bài giảng
    // 2: Tạo giao diện tạo mới book và
    // khi click tạo nut tạo mới thì sẽ gọi api
    // và lưu vào database

    @GetMapping("detail/{id}")
    public String detail(@PathVariable Long id, Model model) throws SQLException {
        Book book = DbUtils.getAllById(id);
        model.addAttribute("b", book);
        return "/jsp/book/detail.jsp";
    }

    @GetMapping("list")
    public String list(Model model,
                       @RequestParam(required = false) String key) throws SQLException {
        List<Book> bookList = DbUtils.getAll(key);
        model.addAttribute("list", bookList);
        return "/jsp/book/list.jsp";
    }
}
