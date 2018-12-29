
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

const name = '조애리';

while (people[num] === name) {
  num = Math.floor(Math.random() * people.length);
}

console.log(people[num]);
