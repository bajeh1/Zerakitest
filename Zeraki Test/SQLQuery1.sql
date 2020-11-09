create table student(
   studentid INT primary key identity(1,1) not null,
   name VARCHAR(250) NOT NULL,
     FOREIGN KEY (course) REFERENCES courses(courseId)
   
);

create table courses(
 
   name VARCHAR(250) NOT NULL,
   courseId int primary Key  identity(1,1) NOT NULL,
   FOREIGN KEY (institution) REFERENCES institution(institutionid)
);
create table institution(
   institutionid  int primary key identity(1,1) not null,
   name VARCHAR(250) NOT NULL,
  
);