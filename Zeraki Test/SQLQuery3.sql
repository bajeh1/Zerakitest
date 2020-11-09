USE [education]
GO

SELECT institution.name [Institution Name], courses.name [Course Name],  student.course [Number of Students]
      
  FROM [dbo].[courses] inner join institution on courses.institution=institution.institutionid
  inner join student on courses.courseid=student.course

GO


