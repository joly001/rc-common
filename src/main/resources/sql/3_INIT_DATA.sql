INSERT INTO MILEAGE VALUES('7613FD62152141B3A218F5FCCCC69AFB','k456+700','00',86.1942852526297,41.7433673973716,86.1934747154087,41.7440590472033,NOW(),NOW());
INSERT INTO MILEAGE VALUES('9E6FA5C78DC344178BBBF00FB7D92FE3','k456+800','00',86.1934747154087,41.7440590472033,86.1926819266447,41.7447355518732,NOW(),NOW());
INSERT INTO MILEAGE VALUES('B07335D46A8645CB992C3FDBFB11867A','k456+900','00',86.1926819266447,41.7447355518732,86.1918894015255,41.745411829769,NOW(),NOW());
INSERT INTO MILEAGE VALUES('DC96087D683E4A748FE83CB0F5D904B7','k457','00',86.1918894015255,41.745411829769,86.1910964105876,41.7460884216581,NOW(),NOW());
INSERT INTO MILEAGE VALUES('6EE687E0239E497590BEEE850712C6D7','k457+100','00',86.1910964105876,41.7460884216581,86.1903172599261,41.7467532048134,NOW(),NOW());
INSERT INTO MILEAGE VALUES('C22032BDB64C4BFB9E9B112DDC787608','k457+200','00',86.1903172599261,41.7467532048134,86.1895272128036,41.7474272849945,NOW(),NOW());

INSERT INTO MILEAGE_SEGMENT VALUES('DE7EF4BF3C1B451BA2FF009ED53A94BA','k456+700-k456+800','7613FD62152141B3A218F5FCCCC69AFB','k456+700','9E6FA5C78DC344178BBBF00FB7D92FE3','k456+800',86.1942852526297,41.7433673973716,86.1934747154087,41.7440590472033,8,NOW(),NOW());
INSERT INTO MILEAGE_SEGMENT VALUES('0C5D422D79C241B4A9E960EF5D22A483','k456+800-k456+900','9E6FA5C78DC344178BBBF00FB7D92FE3','k456+800','B07335D46A8645CB992C3FDBFB11867A','k456+900',86.1934747154087,41.7440590472033,86.1926819266447,41.7447355518732,8,NOW(),NOW());
INSERT INTO MILEAGE_SEGMENT VALUES('B33784F1C55F4F8BAE658E3827801B65','k456+900-k457','B07335D46A8645CB992C3FDBFB11867A','k456+900','DC96087D683E4A748FE83CB0F5D904B7','k457',86.1926819266447,41.7447355518732,86.1918894015255,41.745411829769,8,NOW(),NOW());
INSERT INTO MILEAGE_SEGMENT VALUES('2FB560D899D547989DAADDBB4DD51DF3','k457-k457+100','DC96087D683E4A748FE83CB0F5D904B7','k457','6EE687E0239E497590BEEE850712C6D7','k457+100',86.1918894015255,41.745411829769,86.1910964105876,41.7460884216581,8,NOW(),NOW());
INSERT INTO MILEAGE_SEGMENT VALUES('10C8E9885E5E45019601B88FE4E6C500','k457+100-k457+200','6EE687E0239E497590BEEE850712C6D7','k457+100','C22032BDB64C4BFB9E9B112DDC787608','k457+200',86.1910964105876,41.7460884216581,86.1903172599261,41.7467532048134,8,NOW(),NOW());

INSERT INTO WORK_SEGMENT VALUES('3CE26E1B507549E08F292205D4530CD9','k456+700-k456+800','DE7EF4BF3C1B451BA2FF009ED53A94BA','k456+700-k456+800','7613FD62152141B3A218F5FCCCC69AFB','k456+700','9E6FA5C78DC344178BBBF00FB7D92FE3','k456+800',86.1942852526297,41.7433673973716,86.1934747154087,41.7440590472033,'00',NOW(),1,8,'570BB923C48149B28F4E6055196A9F9D','admin',NOW(),NOW(),NOW());
INSERT INTO WORK_SEGMENT VALUES('9A4DA79513E948218C80E2BF339389D0','k456+800-k456+900','0C5D422D79C241B4A9E960EF5D22A483','k456+800-k456+900','9E6FA5C78DC344178BBBF00FB7D92FE3','k456+800','B07335D46A8645CB992C3FDBFB11867A','k456+900',86.1934747154087,41.7440590472033,86.1926819266447,41.7447355518732,'00',NOW(),1,8,'570BB923C48149B28F4E6055196A9F9D','admin',NOW(),NOW(),NOW());
INSERT INTO WORK_SEGMENT VALUES('CC8FFF06CE3E4515A01E0957D05196C0','k456+900-k457','B33784F1C55F4F8BAE658E3827801B65','k456+900-k457','B07335D46A8645CB992C3FDBFB11867A','k456+900','DC96087D683E4A748FE83CB0F5D904B7','k457',86.1926819266447,41.7447355518732,86.1918894015255,41.745411829769,'00',NOW(),1,8,'570BB923C48149B28F4E6055196A9F9D','admin',NOW(),NOW(),NOW());
INSERT INTO WORK_SEGMENT VALUES('F7EDE6A4CA0D4643BD1CBA63B6BDFDF1','k457-k457+100','2FB560D899D547989DAADDBB4DD51DF3','k457-k457+100','DC96087D683E4A748FE83CB0F5D904B7','k457','6EE687E0239E497590BEEE850712C6D7','k457+100',86.1918894015255,41.745411829769,86.1910964105876,41.7460884216581,'00',NOW(),1,8,'570BB923C48149B28F4E6055196A9F9D','admin',NOW(),NOW(),NOW());
INSERT INTO WORK_SEGMENT VALUES('7B873544E2AD4F3A96287B584EDDD9DD','k457+100-k457+200','10C8E9885E5E45019601B88FE4E6C500','k457+100-k457+200','6EE687E0239E497590BEEE850712C6D7','k457+100','C22032BDB64C4BFB9E9B112DDC787608','k457+200',86.1910964105876,41.7460884216581,86.1903172599261,41.7467532048134,'00',NOW(),1,8,'570BB923C48149B28F4E6055196A9F9D','admin',NOW(),NOW(),NOW());

INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('D8B0AE419E4F4B6E8875F263FA9CC50D','3CE26E1B507549E08F292205D4530CD9','2019-04-19 09:00:00','2019-04-19 11:30:00');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('9A5811D9F53F46349CF8AD1A7F17856F','3CE26E1B507549E08F292205D4530CD9','2019-04-19 13:00:00','2019-04-19 23:59:59');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('6DE4F495AB154C7CA110B4EB14A7185A','9A4DA79513E948218C80E2BF339389D0','2019-04-19 09:00:00','2019-04-19 11:30:00');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('D16257E9EDB84701AC33644885D0BCB4','9A4DA79513E948218C80E2BF339389D0','2019-04-19 13:00:00','2019-04-19 23:59:59');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('6831EB2E0F314A38B8FC4CFB0E42D7F3','CC8FFF06CE3E4515A01E0957D05196C0','2019-04-19 09:00:00','2019-04-19 11:30:00');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('877AFD33BE1C42DA960E19E60CE11C09','CC8FFF06CE3E4515A01E0957D05196C0','2019-04-19 13:00:00','2019-04-19 23:59:59');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('BB2C4A385DDF4B6BBADB275911FF94EE','F7EDE6A4CA0D4643BD1CBA63B6BDFDF1','2019-04-19 09:00:00','2019-04-19 11:30:00');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('53F3A1096AEA4C0293DAA64F8AD7AE3C','F7EDE6A4CA0D4643BD1CBA63B6BDFDF1','2019-04-19 13:00:00','2019-04-19 23:59:59');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('29A2A75AB87E41DFA7313FDE2E5FE561','7B873544E2AD4F3A96287B584EDDD9DD','2019-04-19 09:00:00','2019-04-19 11:30:00');
INSERT INTO WORK_SEGMENT_DATA_TIME VALUES('74E1CB57CF58403E9265F74F614C75BE','7B873544E2AD4F3A96287B584EDDD9DD','2019-04-19 13:00:00','2019-04-19 23:59:59');