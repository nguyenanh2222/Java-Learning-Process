package org.example.student;

/* Xây dựng Student Controller với các yêu cầu sau:
Tạo đối tượng Student với 2 thuộc tính name và age.
Tạo list để chứa danh sách Student.
Viết chức phương thức thêm mới student sử dụng @RequestParam.
Viết chức phương thức thêm mới student sử dụng @PathVariable.
Viết chức phương thức thêm mới student sử dụng @RequestBody.
Tất cả 3 phương thức trên đều trả về danh sách Student dạng JSON.
*/
public class Student implements IStudent {
    private String name;
    private Integer age;
    public Student(String name, Integer age) {
    }

    @Override
    public Student create() {
        return null;
    }
}
