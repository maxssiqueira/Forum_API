create table user (
                      user_id int not null auto_increment,
                      first_name varchar(50) not null,
                      last_name varchar(50) not null,
                      email varchar(50) not null,
                      role varchar(50) not null,
                      created_at datetime not null,
                      updated_at datetime null,

                      primary key (user_id)
);

create table category (
                          category_id int not null auto_increment,
                          name varchar(50) not null,
                          created_at datetime not null,

                          primary key (category_id)
);

create table course (
                        course_id int not null auto_increment,
                        name varchar(200) not null,
                        category_id int not null,
                        number_of_lessons int not null,
                        workload double not null,
                        description varchar(500) not null,
                        status varchar(50) not null,
                        has_certificate boolean not null,
                        evaluation double not null,
                        created_at datetime not null,
                        updated_at datetime null,
                        created_by int not null,


                        primary key (course_id),
                        foreign key (created_by) references user(user_id),
                        foreign key (category_id) references category(category_id)
);

create table certificate(
                            certificate_id int not null auto_increment,
                            course_id int not null,
                            user_id int not null,
                            created_at datetime not null,
                            updated_at datetime null,

                            primary key (certificate_id),
                            foreign key (course_id) references course(course_id),
                            foreign key (user_id) references user(user_id)
);

create table subscription(
                             subscription_id int not null auto_increment,
                             course_id int not null,
                             user_id int not null,
                             progress double not null,
                             status varchar(50) not null,
                             created_at datetime not null,
                             updated_at datetime null,

                             primary key (subscription_id),
                             foreign key (course_id) references course(course_id),
                             foreign key (user_id) references user(user_id)
);

create table course_approval(
                                course_approval_id int not null auto_increment,
                                course_id int not null,
                                approved_by varchar(100) not null,
                                created_at datetime not null,
                                updated_at datetime null,

                                primary key (course_approval_id),
                                foreign key (course_id) references course(course_id)
);

create table course_lesson(
                              course_lesson_id int not null auto_increment,
                              course_id int not null,
                              title varchar(250) not null,
                              duration double not null,
                              created_at datetime not null,
                              updated_at datetime null,

                              primary key (course_lesson_id),
                              foreign key (course_id) references course(course_id)
);

