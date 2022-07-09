use std::fmt::{self, Display};
pub struct Item {
    pub name: String,
}

impl Item {
    pub fn new(name: impl Into<String>) -> Item {
        Item {
            name: name.into(),
        }
    }
}

fn main() -> &'static str {
    return "Hello World!"
}

#[cfg(test)]
mod tests {
    use crate::main;

    #[test]
    pub fn foo() {
        assert_eq!("Hello World!", main());
    }
}
