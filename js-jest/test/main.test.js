const { main } = require("../src/main");

describe("Sample Test", function() {
  it("should return Hello World!", function() {
    expect(main()).toBe("Hello World!");
  });
});
