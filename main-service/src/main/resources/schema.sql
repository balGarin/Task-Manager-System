CREATE TABLE IF NOT EXISTS tasks(
task_id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
title VARCHAR(50) NOT NULL,
description VARCHAR(200) ,
author_name VARCHAR(50) NOT NULL,
executor_name VARCHAR(50),
status NOT NULL,
priority NOT NULL
);

CREATE TABLE IF NOT EXISTS comments (
 comment_id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
 task_id INTEGER REFERENCES tasks(task_id),
  commentText TEXT NOT NULL,
);