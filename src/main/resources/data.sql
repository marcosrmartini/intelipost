insert into artista(nome) values ('Sidney Magal');
insert into artista(nome) values ('Wesley Safadão');
insert into artista(nome) values ('Serj tankian');
insert into artista(nome) values ('Mike Shinoda');
insert into artista(nome) values ('Michel Teló');
insert into artista(nome) values ('Guns N Roses');
insert into artista(nome) values ('Linkin Park');

insert into album (artista_id, nome) select id, 'Baila Magal' from artista where nome = 'Sidney Magal';
insert into album (artista_id, nome) select id, 'Coração Latino' from artista where nome = 'Sidney Magal';
insert into album (artista_id, nome) select id, 'Vibrações' from artista where nome = 'Sidney Magal';
insert into album (artista_id, nome) select id, 'Ws Mais um Vez' from artista where nome = 'Wesley Safadão';
insert into album (artista_id, nome) select id, 'Eu e a torcida do Brasil' from artista where nome = 'Wesley Safadão';
insert into album (artista_id, nome) select id, 'Romance com safadeza' from artista where nome = 'Wesley Safadão';
insert into album (artista_id, nome) select id, 'Harakiri' from artista where nome = 'Serj tankian';
insert into album (artista_id, nome) select id, 'Black Blooms' from artista where nome = 'Serj tankian';
insert into album (artista_id, nome) select id, 'The Rough Dog' from artista where nome = 'Serj tankian';
insert into album (artista_id, nome) select id, 'The Rising Tied' from artista where nome = 'Mike Shinoda';
insert into album (artista_id, nome) select id, 'Post Traumatic' from artista where nome = 'Mike Shinoda';
insert into album (artista_id, nome) select id, 'Post Traumatic EP' from artista where nome = 'Mike Shinoda';
insert into album (artista_id, nome) select id, 'Where do You Go' from artista where nome = 'Mike Shinoda';
insert into album (artista_id, nome) select id, 'Bem Sertanejo' from artista where nome = 'Michel Teló';
insert into album (artista_id, nome) select id, 'Bem Sertanejo - O Show (Ao Vivo)' from artista where nome = 'Michel Teló';
insert into album (artista_id, nome) select id, 'Bem Sertanejo - (1ª Temporada) - EP' from artista where nome = 'Michel Teló';
insert into album (artista_id, nome) select id, 'Use Your IIIlusion I' from artista where nome = 'Guns N Roses';
insert into album (artista_id, nome) select id, 'Use Your IIIlusion II' from artista where nome = 'Guns N Roses';
insert into album (artista_id, nome) select id, 'Greatest Hits' from artista where nome = 'Guns N Roses';
insert into album (artista_id, nome) select id, 'Meteora (Bonus Edition)' from artista where nome = 'Linkin Park';
insert into album (artista_id, nome) select id, 'Hybrid Theory' from artista where nome = 'Linkin Park';
insert into album (artista_id, nome) select id, 'Hybrid Theory (Bonus Edition)' from artista where nome = 'Linkin Park';
insert into album (artista_id, nome) select id, 'Hybrid Theory Live Around The World' from artista where nome = 'Linkin Park';




