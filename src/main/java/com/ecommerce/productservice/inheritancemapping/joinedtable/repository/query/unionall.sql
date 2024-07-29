select u1_0.id,u1_0.clazz_,u1_0.email,u1_0.name,u1_0.no_of_sessions,u1_0.rating,u1_0.batch_name,u1_0.psp from (select id, email, name, null as no_of_sessions, null as rating, null as batch_name, null as psp, 0 as clazz_ from tpc_user
 union all
 select id, email, name, no_of_sessions, rating, null as batch_name, null as psp, 1 as clazz_ from tpc_mentor
  union all
  select id, email, name, null as no_of_sessions, null as rating, batch_name, psp, 2 as clazz_ from tpc_student) u1_0
--When we query the base class in table per class configuration it queries from the child classes as well and does a union all to combine all
--the query result