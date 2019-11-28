<!-- the line below needs to be an empty line C: (its because kramdown isnt
     that smart and dearly wants an empty line before a heading to be able to
     display it as such, e.g. website) -->

# Design patterns implemented in Java

[![Build status](https://travis-ci.org/iluwatar/java-design-patterns.svg?branch=master)](https://travis-ci.org/iluwatar/java-design-patterns)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![Join the chat at https://gitter.im/iluwatar/java-design-patterns](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/iluwatar/java-design-patterns?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=com.iluwatar%3Ajava-design-patterns&metric=alert_status)](https://sonarcloud.io/dashboard/index/com.iluwatar%3Ajava-design-patterns)

# Introduction

Design patterns are formalized best practices that the programmer can use to
solve common problems when designing an application or system.

Design patterns can speed up the development process by providing tested, proven
development paradigms.

Reusing design patterns helps to prevent subtle issues that can cause major
problems, and it also improves code readability for coders and architects who
are familiar with the patterns.

# Getting started

Before you dive into the material, you should be familiar with various
Programming/Software Design Principles.

All designs should be as simple as possible. You should start with KISS, YAGNI,
and Do The Simplest Thing That Could Possibly Work principles. Complexity and
patterns should only be introduced when they are needed for practical
extensibility.

Once you are familiar with these concepts you can start drilling down into
patterns by any of the following approaches

 - Using difficulty tags, `Difficulty-Beginner`, `Difficulty-Intermediate` & `Difficulty-Expert`.
 - Using pattern categories, `Creational`, `Behavioral` and others.
 - Search for a specific pattern. Can't find one? Please report a new pattern [here](https://github.com/iluwatar/java-design-patterns/issues).

# How to contribute

If you are willing to contribute to the project you will find the relevant information in our [developer wiki](https://github.com/iluwatar/java-design-patterns/wiki). We will help you and answer your questions in the [Gitter chatroom](https://gitter.im/iluwatar/java-design-patterns).

# License

This project is licensed under the terms of the MIT license.



来源：https://github.com/iluwatar/java-design-patterns

来源互联网



# 策略模式
应用场景：买单时的优惠方案

<figure style="font-size: inherit;color: inherit;line-height: inherit;"><img class="" data-ratio="0.459748427672956" data-src="https://mmbiz.qpic.cn/mmbiz_jpg/C1uDMDqjn1icN7uVU6XoaXkU7kAfwztdliaa89X4vnazA8jMluTPBkDhW2kspHLuzKYyicFkBqbPy2vRL7CXXMPcw/640?wx_fmt=jpeg" data-type="jpeg" data-w="3180" style="font-size: inherit; color: inherit; line-height: inherit; display: block; margin-right: auto; margin-left: auto; width: 752px !important; height: auto !important; visibility: visible !important;" title="-w1590" _width="752px" src="https://mmbiz.qpic.cn/mmbiz_jpg/C1uDMDqjn1icN7uVU6XoaXkU7kAfwztdliaa89X4vnazA8jMluTPBkDhW2kspHLuzKYyicFkBqbPy2vRL7CXXMPcw/640?wx_fmt=jpeg&amp;tp=webp&amp;wxfrom=5&amp;wx_lazy=1&amp;wx_co=1" crossorigin="anonymous" data-fail="0"></figure>

strategy
可以通过接口+组合的方式，实现策略，减少if else 



