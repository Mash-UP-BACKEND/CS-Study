const people = [
  '박소연',
  '이로히',
  '이미림',
  '이윤희',
  '이한영',
  '정성민',
  '조애리',
  '주미선',
  '천이수',
];

let num = Math.floor(Math.random() * people.length);

const name = ['조애리', '이윤희', '이한영'];
const count = 3;
const result = []

for (let i = 0; i < count; i += 1) { 
  while (name.indexOf(people[num]) > -1 || result.indexOf(people[num]) > -1) {
    num = Math.floor(Math.random() * people.length);
  }
  result.push(people[num]);
}

console.log(result);
