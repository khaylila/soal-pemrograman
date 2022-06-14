# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
print("Hello world\n");
# asdf = input('Mau bermain? ');
# while asdf == 'y':
#     asdf = input('Mau bermain? ');

import random;

song = {
    'list':{
        "niah" : 'jangan beritahu niah',
        'khaylila' : 'khaylila song',
        'lia' : 'lia lia lia',
        'rani' : 'perhatikan rani'
    },
    'listSong' : 0,
    'lenListSong' : 0,
    'nowList' : '',
};
nilai = {
    'benar' : 0,
    'salah' : 0,
};

def checkSong():
    newSong = song['list'];
    song['listSong'] = list(song['list']);
    song['lenListSong'] = len(song['listSong'])-1;
    song['nowList'] = song['listSong'][random.randint(0, song['lenListSong'])];
    print(song['nowList']);
    answer = input('Jawaban anda? ');
    if not answer == song['list'][song['nowList']]:
        print('salah\n');
        nilai['salah'] += 1;
    else:
        print('benar\n');
        nilai['benar'] += 1;
    song['list'].pop(song['nowList']);
    
print("~Tebak lagi sheila on 7~")
askMain = input('Mau bermain? ');

while askMain == 'y':
    song = {
        'list':{
            "niah" : 'jangan beritahu niah',
            'khaylila' : 'khaylila song',
            'lia' : 'lia lia lia',
            'rani' : 'perhatikan rani'
        },
        'listSong' : 0,
        'lenListSong' : 0,
        'nowList' : '',
    };
    nilai = {
        'benar' : 0,
        'salah' : 0,
    };
    checkSong();
    while song['lenListSong'] > 0:
        checkSong();
        
    print(nilai);
    askMain = input('Main? ');
