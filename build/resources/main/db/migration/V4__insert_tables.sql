INSERT INTO alabar_backend.movie(name, image, description, release_date, age_restriction, format_movie)
values ('Кунг-фу Панда 4',
        'https://kinogo.biz/uploads/mini/minifull/5ee/1710036720-292892332.jpg',
        'Хамелеонша овладела уникальной способностью при которой могла изучать техники побеждённых противников и перевоплощаться в них. При помощи этого она одолела почти каждого воина, что сделало её намного сильнее. Тай Лунг ничего не смог противопоставить и теперь находится под её полным контролем.',
        TO_DATE ('2023/04/2', 'yyyy/mm/dd'), '6', 'CARTOON');

INSERT INTO alabar_backend.genre(name)
values ('cartoon');

INSERT INTO alabar_backend.user(name, login_image)
values ('Nakermaz', 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Google_%22G%22_logo.svg/768px-Google_%22G%22_logo.svg.png');

INSERT INTO alabar_backend.rating(value, user_id, movie_id)
values (1, 1, 1);