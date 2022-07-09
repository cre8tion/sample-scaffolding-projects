import { expect } from 'chai';
import { Item, main } from '@/main';

describe('Sample Test', () => {
  it('should return Hello World', () => {
    expect(main()).to.equal('Hello World!');
  });
});
