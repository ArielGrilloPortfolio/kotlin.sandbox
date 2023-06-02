CREATE TABLE personal_admin.tasks
(
    id             serial primary key NOT NULL ,
    title          varchar(50) NOT NULL,
    description    text,
    isDone         bool
)
TABLESPACE pg_default;