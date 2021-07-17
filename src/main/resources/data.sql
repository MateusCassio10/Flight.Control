insert into airplane( id,capacity,model) values(1, 450, 'Boing 777-300' );

insert into pilot(id,birthday,name) values(1, '1996-07-25', 'Mateus Cassio');

insert into flight(id,start,end,origin,destiny,airplane_id,pilot_id) values(1,'1503235800000',
'1503244800000', 'Los Angeles-CA', 'New York-NY', 1, 1);

insert into flight_Status(id,status,time,flight_status_id) values(1, "Boarding", '1503232000000',1);
